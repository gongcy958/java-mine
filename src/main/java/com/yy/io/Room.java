package com.yy.io;



import java.io.*;

/**
 * @author gongcy
 * @date 2022/12/15 8:28 下午
 * @Description
 */
public class Room {

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }finally {
            br.close();
        }
    }

    static void copy(String src,String dst) throws IOException {
        try (InputStream in = new FileInputStream(src) ;
             OutputStream out = new FileOutputStream(dst)) {
                byte[] buf = new byte[128];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
        }
    }
}
