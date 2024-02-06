void main(){
    int textCount = 0, lineBreak = 5, lineBreakValueStore = 0;
    while (textCount++ < 15) {
        System.out.print(textCount == lineBreakValueStore? "* \n": "* ");
        if (textCount % 3 == 0) lineBreakValueStore += lineBreak--;
    }
    textCount = 15;
    lineBreak++;
    lineBreakValueStore += lineBreak;
    while (15 <= textCount && textCount < 30) {
        System.out.print(textCount++ == lineBreakValueStore? "\n": "* ");
        if (textCount % 3 == 0) lineBreakValueStore += lineBreak++;
    }
}
/*Not completed yet*/