package com.github.muryoutaisuu.wkvoc.api.v1;

import com.github.muryoutaisuu.wkvoc.model.Vocabulary;
import com.github.muryoutaisuu.wkvoc.service.VocabularyService;

public class VocabularyController {

    private final VocabularyService vocabularyService;

    public VocabularyController(VocabularyService vocabularyService) {
        this.vocabularyService = vocabularyService;
    }

    public void addVocabulary(Vocabulary vocabulary) {
        vocabularyService.addVocabulary(vocabulary);
    }

}