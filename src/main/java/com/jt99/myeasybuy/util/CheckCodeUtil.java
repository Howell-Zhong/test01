package com.jt99.myeasybuy.util;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 登录验证码工具类
 */
public class CheckCodeUtil {

    public static void random(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //设置输出的文档MIME类型，默认为text/html，是HTML文档的类型。如果需要生成JPEG类型，就要设置成image/jpeg
        response.setContentType("image/jpeg");
        //设置不缓存
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        //设置过期的时间期限
        response.setDateHeader("Expires", 0);

        HttpSession session=request.getSession();

        try{
            int width=50, height=20;
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.getGraphics();
            Random random = new Random();
            g.setColor(getRandColor(200,250));
            g.fillRect(0, 0, width, height);
            g.setFont(new Font("Times New Roman",Font.PLAIN,18));
            // 画边框
            // g.setColor(new Color());
            // g.drawRect(0,0,width-1,height-1);

            g.setColor(getRandColor(160,200));
            for (int i=0;i<155;i++) {
                int x = random.nextInt(width);
                int y = random.nextInt(height);
                int xl = random.nextInt(12);
                int yl = random.nextInt(12);
                g.drawLine(x,y,x+xl,y+yl);
            }

            StringBuffer randCode = new StringBuffer();
            for (int i=0;i<4;i++){
                String rand=String.valueOf(random.nextInt(10));
                randCode.append(rand);
                g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));//调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
                g.drawString(rand,10*i+6,16);
            }

            session.removeAttribute("loginCheckCode");
            session.setAttribute("loginCheckCode", randCode.toString());
            System.out.println("request.getSession()="+request.getSession().getId());
            System.out.println("loginCheckCode=" + session.getAttribute("loginCheckCode"));
            g.dispose();
            ServletOutputStream responseOutputStream =response.getOutputStream();
            ImageIO.write(image, "JPEG", responseOutputStream);
            responseOutputStream.flush();
            responseOutputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private static Color getRandColor(int fc,int bc){
        Random random = new Random();
        if(fc>255) fc=255;
        if(bc>255) bc=255;
        int r=fc+random.nextInt(bc-fc);
        int g=fc+random.nextInt(bc-fc);
        int b=fc+random.nextInt(bc-fc);
        return new Color(r,g,b);
    }

}
