void main(){
    int textCount = 0, lineBreak = 5,lineBreakValueStore = 0;
    while (textCount++ < 15) {
        System.out.print(textCount == lineBreakValueStore? "* \n": "* ");
        if (textCount % 3 == 0)  lineBreakValueStore += lineBreak--;
    }
}