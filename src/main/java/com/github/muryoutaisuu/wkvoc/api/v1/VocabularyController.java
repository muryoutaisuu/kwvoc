package com.github.muryoutaisuu.wkvoc.api.v1;

import java.util.List;

import com.github.muryoutaisuu.wkvoc.model.Vocabulary;
import com.github.muryoutaisuu.wkvoc.service.VocabularyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/vocabulary")
@RestController
public class VocabularyController {

    private final VocabularyService vocabularyService;

    @Autowired
    public VocabularyController(VocabularyService vocabularyService) {
        this.vocabularyService = vocabularyService;
    }

    @PostMapping
    public void addVocabulary(@RequestBody Vocabulary vocabulary) {
        vocabularyService.addVocabulary(vocabulary);
    }

    @GetMapping
    public List<Vocabulary> getAllVocabulary() {
        return vocabularyService.getAllVocabulary();
    }

    @GetMapping(path = "{id}")
    public Vocabulary getVocabularyById(@PathVariable("id") int id) {
        return vocabularyService.getVocabularyById(id)
            .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteVocabularyById(@PathVariable("id") int id) {
        vocabularyService.deleteVocabulary(id);
    }

    @PutMapping(path = "{id}")
    public void updateVocabulary(@PathVariable("id") int id, @RequestBody Vocabulary vocabulary) {
        vocabularyService.updateVocabulary(id, vocabulary);
    }

}