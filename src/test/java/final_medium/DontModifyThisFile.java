/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package final_medium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DontModifyThisFile {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  public FinalExamMediumCorrectAnswer f = new FinalExamMediumCorrectAnswer();

  public ArrayList<Monster> a = f.arrMonster;
  public int[] ss = new int[]{6896113,
          35455630, 40476538,
          59244577, 59707323,
          65189192, 290345485,
          273790361};

  public DontModifyThisFile(){
    Monster.random = new Random(999);
  }

  public static void main(String[] args) throws IOException {
    t8();
  }

  public int h(ArrayList<Monster> aa){
    String s = "";
    int size = aa.size();
    for(int i = 0; i < size; i ++){
      s += aa.get(i);
    }
    char[] c = s.toCharArray();
    int hhh = 0;
    int i = 1;
    for(char _c: c){
      hhh += ((((int) _c * 541) % 479) * ((i * 311) % 491));
      i ++;
    }
    return hhh;
  }

  public static int t1(){
    DontModifyThisFile d = new DontModifyThisFile();
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneTortoise();

    int h = d.h(d.a);
    System.out.println(h);
    return h;
  }

  public static int t2(){
    DontModifyThisFile d = new DontModifyThisFile();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();

    int h = d.h(d.a);
    System.out.println(h);
    return h;
  }

  public static int t3(){
    DontModifyThisFile d = new DontModifyThisFile();
    String s = "";
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.sortArrUsingComparableInterface();

    int h = d.h(d.a);
    System.out.println(h);
    return h;
  }

  public static int t4(){
    DontModifyThisFile d = new DontModifyThisFile();
    String s = "";
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.cloneLastMonster();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.cloneLastMonster();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();

    int h = d.h(d.a);
    System.out.println(h);
    return h;
  }

  public static int t5(){
    DontModifyThisFile d = new DontModifyThisFile();
    String s = "";
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneDragon();
    d.f.upgradeLastMonster();
    d.f.addOneDragon();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();

    int h = d.h(d.a);
    System.out.println(h);
    return h;
  }

  public static int t6(){
    DontModifyThisFile d = new DontModifyThisFile();
    int hh = 0;

    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneDragon();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.removeAllDragons();
    hh += d.h(d.a);
    d.f.addOneBull();

    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.removeAllBulls();

    hh += d.h(d.a);
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.removeAllBulls();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.removeAllDragons();
    hh += d.h(d.a);
    d.f.removeAllDragons();
    hh += d.h(d.a);
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.removeAllTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    hh += d.h(d.a);
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    hh += d.h(d.a);

    System.out.println(hh);
    return hh;
  }


  public static int t7() throws IOException {
    DontModifyThisFile d = new DontModifyThisFile();
    int hh = 0;

    d.f.saveArrToTextFile();
    d.f.addOneBull();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneTortoise();
    hh += d.h(d.a);
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneTortoise();
    d.f.saveArrToTextFile();
    hh += d.h(d.a);
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.saveArrToTextFile();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneTortoise();
    hh += d.h(d.a);
    d.f.saveArrToTextFile();
    d.f.addOneTortoise();
    d.f.addOneBull();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.saveArrToTextFile();
    d.f.addOneBull();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneBull();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneTortoise();
    d.f.saveArrToTextFile();
    d.f.addOneTortoise();
    d.f.addOneBull();
    d.f.addOneDragon();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneTortoise();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.saveArrToTextFile();
    hh += d.h(d.a);
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    hh += d.h(d.a);
    System.out.println(hh);
    return hh;
  }

  public void grable() throws IOException {
    int r = 0;
    int i = 5;
    if(ss[0] == t1()) r += i;
    if(ss[1] == t2()) r += i;
    if(ss[2] == t3()) r += i;
    if(ss[3] == t4()) r += i;
    if(ss[4] == t5()) r += i;
    if(ss[5] == t6()) r += i;
    if(ss[6] == t7()) r += i;
    if(ss[7] == t8()) r += i;
    String rrr = String.valueOf(r);
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("grable/grable"));
      bw.write(rrr);
      bw.close();
    }
    catch (Exception e){}
  }

  public static int t8() throws IOException {
    DontModifyThisFile d = new DontModifyThisFile();
    int hh = 0;

    d.f.saveArrToTextFile();
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.sortArrUsingComparableInterface();
    d.f.addOneDragon();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    hh += d.h(d.a);
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneTortoise();
    d.f.saveArrToTextFile();
    hh += d.h(d.a);
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.sortArrUsingComparableInterface();
    d.f.addOneDragon();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.saveArrToTextFile();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.addOneTortoise();
    hh += d.h(d.a);
    d.f.sortArrUsingComparableInterface();
    d.f.removeAllTortoise();
    d.f.saveArrToTextFile();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneBull();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneBull();
    d.f.addOneBull();
    d.f.removeAllTortoise();
    d.f.saveArrToTextFile();
    d.f.addOneBull();
    d.f.sortArrUsingComparableInterface();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.addOneBull();
    d.f.addOneDragon();
    d.f.addOneBull();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneDragon();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.addOneTortoise();
    d.f.sortArrUsingComparableInterface();
    d.f.saveArrToTextFile();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneBull();
    d.f.addOneDragon();
    hh += d.h(d.a);
    d.f.addOneDragon();
    d.f.addOneTortoise();
    d.f.loadArrFromTextFile();
    hh += d.h(d.a);
    d.f.saveArrToTextFile();
    hh += d.h(d.a);
    d.f.sortArrUsingComparableInterface();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.addOneTortoise();
    d.f.addOneTortoise();
    d.f.cloneLastMonster();
    d.f.upgradeLastMonster();
    d.f.sortArrUsingComparableInterface();
    hh += d.h(d.a);
    System.out.println(hh);
    return hh;
  }



  @Test
  public void test1(){
    assertEquals(ss[0], t1());
  }

  @Test
  public void test2(){
    assertEquals(ss[1], t2());
  }

  @Test
  public void test3(){
    assertEquals(ss[2], t3());
  }

  @Test
  public void test4(){
    assertEquals(ss[3], t4());
  }

  @Test
  public void test5(){
    assertEquals(ss[4], t5());
  }

  @Test
  public void test6(){
    assertEquals(ss[5], t6());
  }

  @Test
  public void test7() throws IOException {
    assertEquals(ss[6], t7());
  }

  @Test
  public void test8() throws IOException {
    assertEquals(ss[7], t8());
  }

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() throws IOException {
    grable(); System.setOut(originalOut);
  }

}
