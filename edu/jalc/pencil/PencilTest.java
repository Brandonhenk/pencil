package edu.jalc.pencil;

import edu.jalc.pencil.eraser.Eraser;
import edu.jalc.pencil.eraser.material.Material;

public class PencilTest{
  public void getEraserTest(){
    System.out.println("Testing Pencil :: getEraser");
    Material material = new Material("rubber");
    Eraser eraser = new Eraser(material);
    Pencil pencil = new Pencil(eraser);
    assert(pencil.getEraser() == eraser);
  }
  public void setEraserTest(){
    System.out.println("Testing Pencil :: setEraser");
    Material material = new Material("rubber");
    Eraser eraser = new Eraser(material);
    Pencil pencil = new Pencil(eraser);
    assert(pencil.setEraser(eraser) == eraser);
  }

  public static void main(String[] args){
    PencilTest pencilTest = new PencilTest();
    pencilTest.getEraserTest();
    pencilTest.setEraserTest();
    System.out.println("Test is complete");
  }
}
