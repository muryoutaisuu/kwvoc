package com.github.muryoutaisuu.wkvoc.service;

import java.util.List;
import java.util.Optional;

import com.github.muryoutaisuu.wkvoc.data.VocabularyData;
import com.github.muryoutaisuu.wkvoc.model.Vocabulary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VocabularyService {

    private final VocabularyData vData;

    @Autowired
    public VocabularyService(@Qualifier("fakeData") VocabularyData vData) {
        this.vData = vData;
    }

    public void addVocabulary(Vocabulary vocabulary) {
        vData.insertVocabulary(vocabulary);
    }

    public List<Vocabulary> getAllVocabulary() {
        return vData.selectAllVocabulary();
    }

    public Optional<Vocabulary> getVocabularyById(int id) {
        return vData.selectVocabularyById(id);
    }

    public void deleteVocabulary(int id){
        vData.deleteVocabulary(id);
    }

    public void updateVocabulary(int id, Vocabulary vocabulary) {
        vData.updateVocabularyById(id, vocabulary);
    }

}