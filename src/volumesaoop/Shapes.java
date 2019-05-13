/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumesaoop;

import java.util.Scanner;

/**
 *
 * @author jgao2
 */

public class Shapes implements shapeInterface{
    float volume;
    float SA;
    
    @Override
    public void rectVolume(float length, float width, float height) {
        volume = length*width*height;
    }

    @Override
    public void rectSA(float length, float width, float height) {
        SA = 2*length*width + 2*length*height + 2*width*height;
    }
    
    @Override
    public void triVolume(float length, float height){
        volume = (float) Math.pow(length,2);
    }
    @Override
    public void triSA(float length, float height){
        SA = (float) (Math.pow(length,2) + 2*length*Math.sqrt(0.25*Math.pow(length,2)+Math.pow(height,2)));
    }
    
    public void getVolume(){
        System.out.printf("%.2f\n",volume);
    }
    public void getSA(){
        System.out.printf("%.2f\n",SA);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'rect' to find volume and SA of rectangular prism");
        System.out.println("'tri' to find volume and SA fo square based pyramid");         
        System.out.println("and 'quit' to exit the program: ");
        String choice = sc.nextLine();
        
        if (choice.equals("quit")) {
            System.exit(0);
        }
        
        while(!choice.equals("quit")){
        
            if (choice.equals("rect")) {
                System.out.println("Enter a length: ");
                float length = sc.nextInt();
                System.out.println("Enter a width: ");
                float width = sc.nextInt();
                System.out.println("Enter a height: ");
                float height = sc.nextInt();

                Shapes rectangularPrism = new Shapes();
                rectangularPrism.rectVolume(length,width,height);
                rectangularPrism.rectSA(length,width,height);
                rectangularPrism.getVolume();
                rectangularPrism.getSA();
            }
            else if (choice.equals("tri")){
                System.out.println("Enter a length: ");
                float length = sc.nextInt();
                System.out.println("Enter a height: ");
                float height = sc.nextInt();
                Shapes trianglePrism = new Shapes();
                trianglePrism.triVolume(length,height);
                trianglePrism.triSA(length,height);
                trianglePrism.getVolume();
                trianglePrism.getSA();
            }
            System.out.println("Type 'rect' to find volume and SA of rectangular prism");
            System.out.println("'tri' to find volume and SA fo square based pyramid");         
            System.out.println("and 'quit' to exit the program: ");
            choice = sc.nextLine();
        }
    }
}
