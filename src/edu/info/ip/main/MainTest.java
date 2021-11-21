package edu.info.ip.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.Console;

import static edu.info.ip.util.ImageUtil.*;

public class MainTest {

    public static void main(String[] args) {
      // BufferedImage inputImg= loadImage("./test_images/lena_color_512.bmp");
        BufferedImage inputImg= loadImage("./test_images/lena_gray_512.bmp");
        displayImage(inputImg, "Original image");
        //displayImage(generateRandom(600,600),"Random Pixels");

//        displayImage(extractBand(inputImg, 'R'),"Red");
//        displayImage(extractBand(inputImg, 'G'),"Green");
//        displayImage(extractBand(inputImg, 'B'),"Blue");
        //displayImage(extractBand(inputImg, 'A'),"Alpha");

//        displayImage(extractBandV2(inputImg, 0),"Redv2");
//        displayImage(extractBandV2(inputImg, 1),"Greenv2");
//        displayImage(extractBandV2(inputImg, 2),"Bluev2");
        //displayImage(extractBandV2(inputImg, 3),"Alphav2");

       displayImage(flipH(inputImg), "Flip H");
        displayImage(flipV(inputImg), "Flip V");
       displayImage(flipH(flipV(inputImg)), "Flip V+H");

        // displayImage(simpleSaltPepperNoise(inputImg,0.03d));

        //gray levels generator
   //     BufferedImage grayLevels =grayLevelGenerator(10,20,1,400);
   //     displayImage(grayLevels);
    //    saveImage(grayLevels, "./out_images/gray_levels_0_10_20_400.png", "png");

        //displayImage(pixelate(inputImg,4));
        //displayImage(brightnessV1(inputImg,40));
      // displayImage(brightnessV2(inputImg,40));
        displayImage(inputImg);
        displayImage(brightnessV3(inputImg,50), "brightness");
        displayImage(brightnessV3(inputImg,-50), "darken");
        displayImage(brightnessV3(brightnessV1(inputImg,-50),50),"wtf");

    }
}
