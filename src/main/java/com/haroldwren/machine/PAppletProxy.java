package com.haroldwren.machine;

import processing.core.PApplet;

import static processing.core.PApplet.atan2;
import static processing.core.PApplet.lerp;

/**
 * Created by jack on 2017.04.21..
 *
 * A little class that proxying the PApplet drawing methods.
 */
public class PAppletProxy {
    /**
     * The PApplet instance.
     */
    private final PApplet pApplet;
    /**
     * The PAppletProxy instance.
     */
    private static PAppletProxy pAppletProxyInstance;
    private Integer givenHeight;
    private Integer givenWidth;

    /**
     * Singleton pattern.
     */
    private PAppletProxy() {
        this.pApplet = null;
    }
    private PAppletProxy(PApplet pApplet) {
        this.pApplet = pApplet;
    }
    public static PAppletProxy getInstance(PApplet pApplet) {
        if(pAppletProxyInstance != null) {
            return pAppletProxyInstance;
        }
        return (pAppletProxyInstance = new PAppletProxy(pApplet));
    }

    /**
     * Coloring the background
     *
     * @param rgb
     */
    public void background(int rgb) {
        if(this.checkPApplet()) {
            this.pApplet.background(rgb);
        }
    }

    /**
     * Turn off the stroke
     */
    public void noStroke() {
        if(this.checkPApplet()) {
            this.pApplet.noStroke();
        }
    }

    /**
     * Turn off the filling.
     */
    public void noFill() {
        if(this.checkPApplet()) {
            this.pApplet.noFill();
        }
    }

    /**
     * Aligning the text
     *
     * @param align
     */
    public void textAlign(int align) {
        if(this.checkPApplet()) {
            this.pApplet.textAlign(align);
        }
    }

    /**
     * Fill with rgb
     *
     * @param rgb
     */
    public void fill(Integer rgb) {
        if(this.checkPApplet()) {
            this.pApplet.fill(rgb);
        }
    }

    /**
     * Fill with rgba
     *
     * @param red
     * @param green
     * @param blue
     * @param alpha
     */
    public void fill(Float red, Float green, Float blue, Float alpha) {
        if(this.checkPApplet()) {
            this.pApplet.fill(red, green, blue, alpha);
        }
    }

    /**
     * Fill with rgb.
     *
     * @param red
     * @param green
     * @param blue
     */
    public void fill(Float red, Float green, Float blue) {
        if(this.checkPApplet()) {
            this.pApplet.fill(red, green, blue);
        }
    }

    /**
     * Fill with rgba.
     *
     * @param red
     * @param green
     * @param blue
     * @param alpha
     */
    public void fill(Integer red, Integer green, Integer blue, Integer alpha) {
        if(this.checkPApplet()) {
            this.pApplet.fill(red, green, blue, alpha);
        }
    }

    /**
     * Fill with rgb.
     *
     * @param red
     * @param green
     * @param blue
     */
    public void fill(Integer red, Integer green, Integer blue) {
        if(this.checkPApplet()) {
            this.pApplet.fill(red, green, blue);
        }
    }

    /**
     * PAppletProxy an ellipse
     *
     * @param xPoint
     * @param yPoint
     * @param width
     * @param height
     */
    public void ellipse(Float xPoint, Float yPoint, Float width, Float height) {
        if(this.checkPApplet()) {
            this.pApplet.ellipse(xPoint, yPoint, width, height);
        }
    }

    /**
     * Draw an ellipse.
     *
     * @param xPoint
     * @param yPoint
     * @param width
     * @param height
     */
    public void ellipse(Integer xPoint, Integer yPoint, Integer width, Integer height) {
        if(this.checkPApplet()) {
            this.pApplet.ellipse(xPoint, yPoint, width, height);
        }
    }

    /**
     * Set the rectangle mode
     *
     * @param mode
     */
    public void rectMode(Integer mode) {
        if(this.checkPApplet()) {
            this.pApplet.rectMode(mode);
        }
    }

    /**
     * Generate a random number between low and high values.
     *
     * @param low
     * @param high
     * @return
     */
    public Float random(float low, float high) {
        if(this.checkPApplet()) {
            return this.pApplet.random(low, high);
        }
        return null;
    }

    public Integer random(int low, int high) {
        if(this.checkPApplet()) {
            return (int)this.pApplet.random(low, high);
        }
        return null;
    }

    /**
     * draw a rectangle
     *
     * @param xPoint
     * @param yPoint
     * @param width
     * @param height
     */
    public void rect(Float xPoint, Float yPoint, Float width, Float height) {
        if(this.checkPApplet()) {
            this.pApplet.rect(xPoint, yPoint, width, height);
        }
    }

    /**
     * Draw a rectangle.
     *
     * @param xPoint
     * @param yPoint
     * @param width
     * @param height
     */
    public void rect(Integer xPoint, Integer yPoint, Integer width, Integer height) {
        if(this.checkPApplet()) {
            this.pApplet.rect(xPoint, yPoint, width, height);
        }
    }

    /**
     * Stroke with the given color.
     *
     * @param rgb
     */
    public void stroke(Integer rgb) {
        if(this.checkPApplet()) {
            pApplet.stroke(rgb);
        }
    }

    /**
     * Stroke with rgba.
     *
     * @param red
     * @param green
     * @param blue
     * @param alpha
     */
    public void stroke(Float red, Float green, Float blue, Float alpha) {
        if(this.checkPApplet()) {
            pApplet.stroke(red, green, blue, alpha);
        }
    }

    /**
     * Set the stroke weight.
     *
     * @param weight
     */
    public void strokeWeight(Float weight) {
        if(this.checkPApplet()) {
            pApplet.strokeWeight(weight);
        }
    }

    /**
     * Set the stroke weight.
     *
     * @param weight
     */
    public void strokeWeight(Integer weight) {
        if(this.checkPApplet()) {
            pApplet.strokeWeight(weight);
        }
    }

    /**
     * Draw a line.
     *
     * @param xPointStart
     * @param yPointStart
     * @param xPointEnd
     * @param yPointEnd
     */
    public void line(Float xPointStart, Float yPointStart, Float xPointEnd, Float yPointEnd) {
        if(this.checkPApplet()) {
            this.pApplet.line(xPointStart, yPointStart, xPointEnd, yPointEnd);
        }
    }

    /**
     * Write a text to the given x, y coord.
     *
     * @param txt
     * @param xPoint
     * @param yPoint
     */
    public void text(String txt, Float xPoint, Float yPoint) {
        if(this.checkPApplet()) {
            this.pApplet.text(txt, xPoint, yPoint);
        }
    }

    /**
     * Write a text to the given x, y coord.
     *
     * @param txt
     * @param xPoint
     * @param yPoint
     */
    public void text(String txt, Integer xPoint, Integer yPoint) {
        if(this.checkPApplet()) {
            this.pApplet.text(txt, xPoint, yPoint);
        }
    }

    /**
     * Sets the text size.
     *
     * @param textSiz
     */
    public void textSize(Float textSiz) {
        if(this.checkPApplet()) {
            this.pApplet.textSize(textSiz);
        }
    }

    /**
     * Sets the text size
     *
     * @param textSiz
     */
    public void textSize(Integer textSiz) {
        if(this.checkPApplet()) {
            this.pApplet.textSize(textSiz);
        }
    }

    /**
     * Draw an arrow.
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public void arrow(Float x1, Float y1, Float x2, Float y2) {
        if(this.checkPApplet()) {
            this.pApplet.line(x1, y1, x2, y2);
            this.pApplet.pushMatrix();
            this.pApplet.translate(x2, y2);
            float a = atan2(x1-x2, y2-y1);
            this.pApplet.rotate(a);
            this.pApplet.line(0, 0, -10, -10);
            this.pApplet.line(0, 0, 10, -10);
            this.pApplet.popMatrix();
        }
    }

    /**
     * Stop the draw method looping.
     */
    public void noLoop() {
        if(this.checkPApplet()) {
            pApplet.noLoop();
        }
    }

    /**
     * Starts the draw method looping.
     *
     */
    public void loop() {
        if(this.checkPApplet()) {
            pApplet.loop();
        }
    }

    /**
     * Draw a dotted line.
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param steps
     */
    public void dottedLine(float x1, float y1, float x2, float y2, float steps){
        for(int i=0; i<=steps; i++) {
            float x = lerp(x1, x2, i/steps);
            float y = lerp(y1, y2, i/steps);
            this.pApplet.noStroke();
            this.pApplet.ellipse(x, y,2,2);
        }
    }

    /**
     * get back the app width
     *
     * @return
     */
    public Integer getWidth() {
        if(this.checkPApplet()) {
            return pApplet.width;
        }
        return givenWidth;
    }

    /**
     * get back the app height
     *
     * @return
     */
    public Integer getHeight() {
        if(this.checkPApplet()) {
            return pApplet.height;
        }
        return givenHeight;
    }

    /**
     * Sets the givenHeight.
     *
     * @param givenHeight
     */
    public void setGivenHeight(Integer givenHeight) {
        this.givenHeight = givenHeight;
    }

    /**
     * Sets the givenWidth.
     *
     * @param givenWidth
     */
    public void setGivenWidth(Integer givenWidth) {
        this.givenWidth = givenWidth;
    }

    public void coloredRectangle(float xPos, float yPos, float width, float height, float radius, int color) {
        if(this.checkPApplet()) {
            pApplet.fill(color);
            pApplet.rect(xPos, yPos, width, height, radius);
        }
    }

    public void coloredText(String text, float xPos, float yPos, float width, float height, int color, float textSize, int textAlign) {
        if(this.checkPApplet()) {
            pApplet.fill(color);
            pApplet.textAlign(textAlign);
            pApplet.textSize(textSize);
            pApplet.text(text, xPos, yPos, width, height);
        }
    }


    /**
     * check if PApplet not null.
     *
     * @return
     */
    private boolean checkPApplet() {
        return this.pApplet != null;
    }

}
