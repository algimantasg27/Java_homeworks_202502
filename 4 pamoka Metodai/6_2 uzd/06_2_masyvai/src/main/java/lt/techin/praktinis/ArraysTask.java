package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {5, 4, 5, 4, 9, 4, 9, 4, 5, 4};

//        boolean minMark = contains(arr, 2);
//        int minMark = lastIndexOf(arr, 2);
        int minMark = getLastElement(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length-1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sumOfArrayElements = 0;
        for (int value : arr) {
            sumOfArrayElements += value;
        }
        return sumOfArrayElements;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        double sumOfArrayElements = 0;
        for (int value : arr) {
            sumOfArrayElements += value;
        }
        return (double)sumOfArrayElements/arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        int lastIndexOfElement = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                lastIndexOfElement = i;
            }
        }
        return lastIndexOfElement;
    }






}
