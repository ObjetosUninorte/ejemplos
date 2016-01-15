/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import javax.swing.ImageIcon;

/**
 *
 * @author pwightman
 */
public class Elemento {
    
    public ImageIcon imagen = new ImageIcon(getClass().getResource("/image/bomba.jpg"));
    public int x,y;
    
    public Elemento(){
        x=0;
        y=0;
    }
    
    public Elemento(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    
}
