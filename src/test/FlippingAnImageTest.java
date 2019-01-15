package test;

import main.java.FlippingAnImage;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class FlippingAnImageTest {

    @Test
    public void flippingAndInvertImage() {
        FlippingAnImage flippingAnImage=new FlippingAnImage();
        int[][] A={{1,1,0},{0,0,1},{1,1,1}};
        int[][] B= flippingAnImage.flippingAndInvertImage(A);
        int[] C={1,2,3,4,5};
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
        System.out.println(C.toString());

    }
}