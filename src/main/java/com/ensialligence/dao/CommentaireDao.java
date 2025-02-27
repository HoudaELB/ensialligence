package com.ensialligence.dao;


import com.ensialligence.model.Commentaire;

import java.util.List;

public interface CommentaireDao {

    Commentaire addComment(Commentaire c);

    Commentaire getCommentById(int idCom);

    List<Commentaire> getComments(int idArticle);

    Commentaire updateComment(Commentaire c);

    void deleteComment(int idCom);
}