import java.io.File;

public class Test {
    public static void main(String[] args) {
        File path = new File("D:\\BaiduNetdiskDownload\\尚学堂互联网架构师视频");
        getIntoPath(path);
    }

    private static void getIntoPath(File path) {
        if (!path.getName().equals("八、互联网分布式综合项目实战")) {
            if (path.isDirectory()) {
                File[] inPath = path.listFiles();
                if (inPath != null) {
                    for (File file : inPath) {
                        getIntoPath(file);
                    }
                }
            }
            if (path.getName().contains("(1).")) {
                path.delete();
            }
        }
    }
}
