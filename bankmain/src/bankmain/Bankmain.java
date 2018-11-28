/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmain;

/**
 *
 * @author piyus
 */
public class Bankmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainpg mp=new mainpg();
       // mp.setVisible(true);
       splash sp=new splash();
       sp.setVisible(true);
       try
       {
       for(int i=0;i<=100;i++)
       {
           Thread.sleep(40);
           splash.loading.setText(Integer.toString(i)+"%");
           splash.loadingbar.setValue(i);
           if(i==100)
           {
                sp.setVisible(false);
                mp.setVisible(true);
           }
       }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
}
