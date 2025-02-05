
        String[] strings = {"Nik","Konstantin", "Oleg","Max"};

        Arrays.sort(strings, Comparator.comparing(String::length, Comparator.reverseOrder()));
        System.out.println(strings[0]);
    }
