package test.folder;
import java.util.Random;
import java.awt.Choice;
import java.awt.Image;
import javax.swing.ImageIcon;
public class text {
    private String textran,text_1,text_2,text_3,text_4,text_5;
    private Choice choicetext;
    private int indextext;
    private ImageIcon u;
    text(){
        choicetext=new Choice();
        text_1="จงเลือกรูปภาพที่เป็นต้นไม้";
        text_2="จงเลือกรูปภาพที่เป็นป้ายทะเบียนรถ";
        text_3="จงเลือกรูปภาพที่เป็นรูปบ้าน";
        text_4="จงเลือกรูปภาพที่เป็นป้ายจราจร";
        text_5="จงเลือกรูปที่ภาพเป็นรถ"; 
        choicetext.add(text_1);
        choicetext.add(text_2);
        choicetext.add(text_3);
        choicetext.add(text_4);
        choicetext.add(text_5);
         int random = (int)(Math.random() * 5);
         textran=choicetext.getItem(random);
    }
  public  int textindex(){
            if(textran=="จงเลือกรูปภาพที่เป็นต้นไม้"){
                indextext=1;
            }else if(textran=="จงเลือกรูปภาพที่เป็นป้ายทะเบียนรถ"){
                indextext=2;
            }else if(textran=="จงเลือกรูปภาพที่เป็นรูปบ้าน"){
                indextext=3;
            }else if(textran=="จงเลือกรูปภาพที่เป็นป้ายจราจร"){
                indextext=4;
            }else{
                indextext=5;
            }
        return indextext;
         
    }
    public String t1(){
        return text_1;
    }
    public String t2(){
        
        return text_2;
    }
    public String t3(){
        return text_3;
    }
    public String t4(){
        return text_4;
    }
    public String t5(){
        return text_5;
    }
    public String gettext(){
        return textran;
    }
}
