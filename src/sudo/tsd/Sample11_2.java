package sudo.tsd;

import java.io.File;

public class Sample11_2 {

	public static void main(String[] args) {
		// デフォルトとしてカレントディレクトリ
        String treeRoot = ".";

        if (args.length >= 1) {
            treeRoot = args[0];
        }
        File rootDir = new File(treeRoot);
        System.out.println("Root of navigation:" + rootDir.getAbsolutePath());
        // ルートがディレクトリとして存在するか確認
        if (!(rootDir.isDirectory())) {
            System.out.println("The root of the naviagtion subtree "
                    + "does not exist as a directory!");
            System.exit(0);
        }

        Sample11_2 obj = new Sample11_2();
        obj.navigate(rootDir);
	}

	// 指定された抽象パスの情報取り出し
	public void navigate(File dir) {
        System.out.println(" ");
        System.out.println("Directory " + dir + ":");

        String[] dirContent = dir.list();
        for (int i = 0; i < dirContent.length; i++) {
            System.out.println(dirContent[i]);
            File child = new File(dir, dirContent[i]);
            if (child.isDirectory()) {
                navigate(child);
            }
        }
    }

}
