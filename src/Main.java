public class Main {
    public static void main(String[] args) {
        String[] array1 = new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = new String[]{"Python", "JAVA", "PHP", "C#", "C++", "HTML"};
        String [] common = ArrayUtil.findCommon ( array1, array2 );
        for (String elem:common){
            System.out.println (elem);

        }

    }
}
