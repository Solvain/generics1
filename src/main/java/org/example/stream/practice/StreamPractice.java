package org.example.stream.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import org.example.stream.model.Candidate;
import org.example.stream.model.Cat;
import org.example.stream.model.Person;


public class StreamPractice {
    public static final String NO_ELEMENT_MESSAGE = "No odd numbers in the list or empty list.";
    public static final String CANT_GET_VALUE_MESSAGE = "Can't get min value from list: ";
    private static final String DIVIDER = ",";

    public int findMinEvenNumber(List<String> numbers) {
        return 0;
    }

    public Double getOddNumsAverage(List<Integer> numbers) {
        return .0;
    }

    public List<Person> selectMenByAge(List<Person> peopleList, int fromAge, int toAge) {
        return null;
    }

    public List<Person> getWorkablePeople(int fromAge, int femaleToAge,
                                          int maleToAge, List<Person> peopleList) {
        return null;
    }

    public List<String> getCatsNames(List<Person> peopleList, int femaleAge) {
        return null;
    }

    public List<String> validateCandidates(List<Candidate> candidates) {
        CandidateValidator validator = new CandidateValidator();
        return null;
    }

    private boolean conditionForCatNames(int femaleAge, Person p) {
        return p.getAge() >= femaleAge && p.getSex() == Person.Sex.WOMAN;
    }

    private boolean isManByAgeMatchInclusive(int fromAge, int toAge, Person p) {
        return p.getAge() <= toAge
                && p.getAge() >= fromAge
                && p.getSex() == Person.Sex.MAN;
    }

    private boolean personFitsAge(int fromAge, int femaleToAge,
                                  int maleToAge, Person p) {
        return p.getAge() <= maleToAge
                && p.getAge() >= fromAge
                && p.getSex() == Person.Sex.MAN
                || p.getAge() <= femaleToAge
                && p.getAge() >= fromAge
                && p.getSex() == Person.Sex.WOMAN;
    }
}