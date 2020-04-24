package com.github.muryoutaisuu.wkvoc.data;

import java.util.ArrayList;
import java.util.List;

import com.github.muryoutaisuu.wkvoc.model.Vocabulary;

public class FakeVocabularyDataAccessService implements VocabularyData{

    private static List<Vocabulary> DB = new ArrayList<>();

    @Override
    public void insertVocabulary(Vocabulary vocabulary) {
        DB.add(vocabulary);
    }

}