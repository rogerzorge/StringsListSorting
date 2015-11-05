package by.epam.stringslistsorting;

/**
 * Created by Yahor_Faliazhynski on 11/4/2015.
 */
public class stringListSorting {

    String[] myStringsArray1 = {"Human Research Program",
                               "Ground Systems",
                               "Manufacturing and Materials",
                               "MAVEN (Mars Atmosphere and Volatile Evolution)",
                               "NASA",
                               "Orion Spacecraft",
                               "Mars",
                               "SEAC4RS (Studies of Emissions, Atmospheric Composition, Clouds and Climate Coupling by Regional Surveys)",
                               "Fermi Gamma-Ray Space Telescope",
                               "Herschel Space Observatory"};

    String[] myStringsArray2 = {"String string 01",
                                "String string string string string string string 02",
                                "String string string string string string 03",
                                "String string string string04",
                                "String string string string string 05",
                                "String 06",
                                "String string string 07"};

    public static void main(String[] args) {

        stringListSorting mySorting = new stringListSorting();

        //Sorting of myStringsArray1 strings
        String[] sortedStringArray1 = strSorting(mySorting.myStringsArray1);

        System.out.println("FIRST result massive sorted by strings length:");

        for (int i = 0; i < mySorting.myStringsArray1.length; i++) {

            System.out.println((i + 1) + ". " + sortedStringArray1[i]);

        }

        System.out.println();
        //Sorting of myStringsArray2 strings
        String[] sortedStringArray2 = strSorting(mySorting.myStringsArray2);

        System.out.println("SECOND result massive sorted by strings length:");

        for (int i = 0; i < mySorting.myStringsArray2.length; i++) {

            System.out.println((i + 1) + ". " + sortedStringArray2[i]);

        }
    }

    public static String[] strSorting(String[] strArr) {

        String tempStr;

        for (int i = strArr.length - 1; i > 0; i--) {
            for (int j = strArr.length - 1; j > 0; j--) {

                if (strArr[j-1].length() > strArr[j].length()) {

                    tempStr = strArr[j-1];
                    strArr[j-1] = strArr[j];
                    strArr[j] = tempStr;

                }
            }
        }
    return strArr;
    }

}
