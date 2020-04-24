package com.github.muryoutaisuu.wkvoc.data;

import java.util.List;
import java.util.Optional;

import com.github.muryoutaisuu.wkvoc.model.Vocabulary;

public interface VocabularyData {

    void insertVocabulary(Vocabulary vocabulary);

    List<Vocabulary> selectAllVocabulary();

    void deleteVocabulary(int id);

    void updateVocabularyById(int id, Vocabulary vocabulary);

    Optional<Vocabulary> selectVocabularyById(int id);
}