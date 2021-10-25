package ex.bmi;

import Sample.enumSample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewMember {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.addAll(Arrays.asList(
                new Member("ppp",Gender.WOMEN,30,1.5,46),
                new Member("aaa", Gender.MEN,25,1.7,70)
        ));
        for(Member member : memberList){
            System.out.println(member);
        }






    }
}
