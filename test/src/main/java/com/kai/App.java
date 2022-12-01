package com.kai;

import java.io.IOException;

import cn.hutool.core.io.file.FileReader;

/**
 * Hello world!
 */
public final class App {
  private App() {
  }

  /**
   * Says hello to the world.
   * 
   * @param args The arguments of the program.
   * @throws IOException
   * @throws InterruptedException
   */
  public static void main(String[] args) throws IOException, InterruptedException {

    FileReader fileReader = new FileReader("/home/codespace/aa.txt");
    Process exec1 = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", "df -h > /home/codespace/aa.txt" });
    exec1.waitFor();
    String readString = fileReader.readString();
    System.out.println(readString);

    System.out.println("最新的代码");

  }
}
