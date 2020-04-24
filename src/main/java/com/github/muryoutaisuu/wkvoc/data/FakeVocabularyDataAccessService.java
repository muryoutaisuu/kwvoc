package com.github.muryoutaisuu.wkvoc.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.github.muryoutaisuu.wkvoc.model.Vocabulary;

import org.springframework.stereotype.Repository;

@Repository("fakeData")
public class FakeVocabularyDataAccessService implements VocabularyData {

    private static List<Vocabulary> DB = new ArrayList<>();

    @Override
    public void insertVocabulary(Vocabulary vocabulary) {
        DB.add(vocabulary);
    }

    @Override
    public List<Vocabulary> selectAllVocabulary() {
        return DB;
    }

    @Override
    public void deleteVocabulary(int id) {
        Optional<Vocabulary> vocabulary =  selectVocabularyById(id);
        if (!vocabulary.isEmpty()) {
            DB.remove(vocabulary.get());
        }

    }

    @Override
    public void updateVocabularyById(int id, Vocabulary vocabulary) {
        return selectVocabularyById(id)
            .map(v -> {
                int i = DB.indexOf(v);
                if (i >= 0) {
                    DB.set(i, vocabulary);
                }
            });
    }

    @Override
    public Optional<Vocabulary> selectVocabularyById(int id) {
        return DB.stream()
            .filter(vocabulary -> vocabulary.getId() == id)
            .findFirst();
    }

}