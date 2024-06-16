package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Birthday {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new Person(input));
        }

        Collections.sort(list);

        System.out.println(list.get(N - 1).getName());
        System.out.println(list.get(0).getName());
    }

    static class Person implements Comparable<Person> {
        String name;
        int dd;
        int mm;
        int yy;

        Person(String[] input) {
            this.name = input[0];
            dd = Integer.parseInt(input[1]);
            mm = Integer.parseInt(input[2]);
            yy = Integer.parseInt(input[3]);
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Person o) {
            if (this.yy == o.yy) {
                if (this.mm == o.mm) {
                    return Integer.compare(this.dd, o.dd);
                }

                return Integer.compare(this.mm, o.mm);
            }

            return Integer.compare(this.yy, o.yy);
        }
    }

}
