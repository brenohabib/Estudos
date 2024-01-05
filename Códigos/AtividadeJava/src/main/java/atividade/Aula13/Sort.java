class Sort {
    
    public static int[] indices;

    public static void selectionSort(String[] array, Float[][] products, boolean isAscending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int key = i;
            for (int j = i; j < n; j++) {
                if (array[j] != null && array[key] != null) {
                    if ((isAscending && array[j].compareTo(array[key]) < 0) || (!isAscending && array[j].compareTo(array[key]) > 0)) {
                        key = j;
                    }
                }
            }
            if (array[key] != null && products[0][key] != null && products[1][key] != null) {
                String tempName = array[key];
                array[key] = array[i];
                array[i] = tempName;

                Float tempPrice = products[0][key];
                Float tempQuantity = products[1][key];

                products[0][key] = products[0][i];
                products[1][key] = products[1][i];

                products[0][i] = tempPrice;
                products[1][i] = tempQuantity;
            }
        }
    }
    
    public static void selectionSort(Float[][] array, String[] names, boolean isAscending) {
        int n = array[0].length;
        for (int i = 0; i < n - 1; i++) {
            int key = i;
            for (int j = i; j < n; j++) {
                if (array[0][j] != null && array[0][key] != null) {
                    if ((isAscending && array[0][j] < array[0][key]) || (!isAscending && array[0][j] > array[0][key])) {
                        key = j;
                    }
                }
            }
            if (array[0][key] != null && array[1][key] != null) {
                Float tempPrice = array[0][key];
                Float tempQuantity = array[1][key];
                String tempName = names[key];

                array[0][key] = array[0][i];
                array[1][key] = array[1][i];
                names[key] = names[i];

                array[0][i] = tempPrice;
                array[1][i] = tempQuantity;
                names[i] = tempName;
            }
        }
    }
    

    public static void insertionSort(String[] array, Float[][] products, boolean isAscending) {
        String key;
        int i, j;

        for (i = 1; i < array.length; i++) {
            if (array[i] == null) continue;
            key = array[i];
            Float productKey1 = products[0][i];
            Float productKey2 = products[1][i];

            j = i - 1;

            while (j >= 0) {
                if (array[j] == null) {
                    j--;
                    continue;
                }

                if ((isAscending && key.compareTo(array[j]) < 0) || (!isAscending && key.compareTo(array[j]) > 0)) {
                    array[j + 1] = array[j];
                    products[0][j + 1] = products[0][j];
                    products[1][j + 1] = products[1][j];
                    j--;
                } else {
                    break;
                }
            }

            array[j + 1] = key;
            products[0][j + 1] = productKey1;
            products[1][j + 1] = productKey2;
        }
    }


    public static void insertionSort(Float[][] array, String[] names, boolean isAscending) {
        int i, j;

        for (i = 1; i < array[0].length; i++) {
            if (array[0][i] == null) continue;
            Float keyPrice = array[0][i];
            Float keyQuantity = array[1][i];
            String keyName = names[i];
            j = i - 1;

            while (j >= 0) {
                if (array[0][j] == null) {
                    j--;
                    continue;
                }

                if ((isAscending && keyPrice < array[0][j]) || (!isAscending && keyPrice > array[0][j])) {
                    array[0][j + 1] = array[0][j];
                    array[1][j + 1] = array[1][j];
                    names[j + 1] = names[j];
                    j--;
                } else {
                    break;
                }
            }

            array[0][j + 1] = keyPrice;
            array[1][j + 1] = keyQuantity;
            names[j + 1] = keyName;
        }
    }

    public static void bubbleSort(Float[][] array, String[] names, boolean isAscending) {
        int n = array[0].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (array[0][j] != null && array[0][j + 1] != null) {
                    if ((isAscending && array[0][j] > array[0][j + 1])
                            || (!isAscending && array[0][j] < array[0][j + 1])) {

                        Float tempPrice = array[0][j];
                        Float tempQuantity = array[1][j];
                        String tempName = names[j];

                        array[0][j] = array[0][j + 1];
                        array[1][j] = array[1][j + 1];
                        names[j] = names[j + 1];

                        array[0][j + 1] = tempPrice;
                        array[1][j + 1] = tempQuantity;
                        names[j + 1] = tempName;
                    }
                }
            }
        }
    }

    public static void bubbleSort(String[] array, Float[][] products, boolean isAscending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (array[j] != null && array[j + 1] != null) {
                    if ((isAscending && array[j].compareTo(array[j + 1]) > 0)
                            || (!isAscending && array[j + 1].compareTo(array[j]) > 0)) {

                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        Float[] tempProduct = new Float[2];
                        tempProduct[0] = products[0][j];
                        tempProduct[1] = products[1][j];

                        products[0][j] = products[0][j + 1];
                        products[1][j] = products[1][j + 1];

                        products[0][j + 1] = tempProduct[0];
                        products[1][j + 1] = tempProduct[1];
                    }
                }
            }
        }
    }
    
    public static void chooseSort(String[] data, String[] nameList, Float[][] productList) {

        int n = nameList.length;
        indices = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;

        }
        boolean ascending = data[2].equals("Crescente");

        if (data[0].equals("Nome")) {

            if (data[1].equals("Bubble Sort")) {
                Sort.bubbleSort(nameList, productList, ascending);

            } else if (data[1].equals("Insertion Sort")) {
                Sort.insertionSort(nameList, productList, ascending);

            } else if (data[1].equals("Selection Sort")) {
                Sort.selectionSort(nameList, productList, ascending);
            }

        } 
        else if (data[0].equals("Preço")) {

            if (data[1].equals("Bubble Sort")) {
                Sort.bubbleSort(productList, nameList, ascending);

            } else if (data[1].equals("Insertion Sort")) {
                Sort.insertionSort(productList, nameList, ascending);

            } else if (data[1].equals("Selection Sort")) {
                Sort.selectionSort(productList, nameList, ascending);
            }
        }
    }
}
