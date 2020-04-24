package com.github.muryoutaisuu.wkvoc.service;

import com.github.muryoutaisuu.wkvoc.data.VocabularyData;
import com.github.muryoutaisuu.wkvoc.model.Vocabulary;

public class VocabularyService {

    private final VocabularyData vData;

    public VocabularyService(VocabularyData vData) {
        this.vData = vData;
    }

    public void addVocabulary(Vocabulary vocabulary) {
        vData.insertVocabulary(vocabulary);
    }

}