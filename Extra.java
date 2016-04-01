/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author julia
 */
public class Extra {

    public static void main(String[] args) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("C:\\Users\\julia\\Desktop\\teste.png"));
        int w = imagem.getWidth();
        int h = imagem.getHeight();
        int[] pixels = imagem.getRGB(0, 0, w, h, null, 0, w);
        Random r = new Random();

        for (int col = 0; col < w; col++) {
          for (int lin = 0; lin < h; lin++) {
            pixels[w * lin + col] =
              new Color(r.nextInt(255), col % 255, lin % 255).getRGB();
          }
        }

        imagem.setRGB(0, 0, w, h, pixels, 0, w);
        ImageIO.write(imagem, "PNG", new File("C:\\Users\\julia\\Desktop\\resultado.png"));
    }
    
}
