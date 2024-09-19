package ci.apirest.forum.services.mapper;

import ci.apirest.forum.models.Forum;
import ci.apirest.forum.models.Message;
import ci.apirest.forum.models.Sujet;
import ci.apirest.forum.services.DTO.ForumDTO;
import ci.apirest.forum.services.DTO.MessageDTO;
import ci.apirest.forum.services.DTO.SujetDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-13T11:41:23+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class ForumMapperImpl implements ForumMapper {

    @Override
    public ForumDTO toDto(Forum entity) {
        if ( entity == null ) {
            return null;
        }

        ForumDTO forumDTO = new ForumDTO();

        forumDTO.setId( entity.getId() );
        forumDTO.setSlug( entity.getSlug() );
        forumDTO.setNom( entity.getNom() );
        forumDTO.setDescription( entity.getDescription() );
        forumDTO.setSujets( sujetListToSujetDTOList( entity.getSujets() ) );

        return forumDTO;
    }

    @Override
    public Forum toEntity(ForumDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Forum forum = new Forum();

        forum.setId( dto.getId() );
        forum.setSlug( dto.getSlug() );
        forum.setNom( dto.getNom() );
        forum.setDescription( dto.getDescription() );
        forum.setSujets( sujetDTOListToSujetList( dto.getSujets() ) );

        return forum;
    }

    protected MessageDTO messageToMessageDTO(Message message) {
        if ( message == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setId( message.getId() );
        messageDTO.setContenu( message.getContenu() );

        return messageDTO;
    }

    protected List<MessageDTO> messageListToMessageDTOList(List<Message> list) {
        if ( list == null ) {
            return null;
        }

        List<MessageDTO> list1 = new ArrayList<MessageDTO>( list.size() );
        for ( Message message : list ) {
            list1.add( messageToMessageDTO( message ) );
        }

        return list1;
    }

    protected SujetDTO sujetToSujetDTO(Sujet sujet) {
        if ( sujet == null ) {
            return null;
        }

        SujetDTO sujetDTO = new SujetDTO();

        sujetDTO.setId( sujet.getId() );
        sujetDTO.setTitre( sujet.getTitre() );
        sujetDTO.setNom( sujet.getNom() );
        sujetDTO.setSlug( sujet.getSlug() );
        sujetDTO.setMessages( messageListToMessageDTOList( sujet.getMessages() ) );

        return sujetDTO;
    }

    protected List<SujetDTO> sujetListToSujetDTOList(List<Sujet> list) {
        if ( list == null ) {
            return null;
        }

        List<SujetDTO> list1 = new ArrayList<SujetDTO>( list.size() );
        for ( Sujet sujet : list ) {
            list1.add( sujetToSujetDTO( sujet ) );
        }

        return list1;
    }

    protected Message messageDTOToMessage(MessageDTO messageDTO) {
        if ( messageDTO == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( messageDTO.getId() );
        message.setContenu( messageDTO.getContenu() );

        return message;
    }

    protected List<Message> messageDTOListToMessageList(List<MessageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Message> list1 = new ArrayList<Message>( list.size() );
        for ( MessageDTO messageDTO : list ) {
            list1.add( messageDTOToMessage( messageDTO ) );
        }

        return list1;
    }

    protected Sujet sujetDTOToSujet(SujetDTO sujetDTO) {
        if ( sujetDTO == null ) {
            return null;
        }

        Sujet sujet = new Sujet();

        sujet.setId( sujetDTO.getId() );
        sujet.setTitre( sujetDTO.getTitre() );
        sujet.setSlug( sujetDTO.getSlug() );
        sujet.setNom( sujetDTO.getNom() );
        sujet.setMessages( messageDTOListToMessageList( sujetDTO.getMessages() ) );

        return sujet;
    }

    protected List<Sujet> sujetDTOListToSujetList(List<SujetDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Sujet> list1 = new ArrayList<Sujet>( list.size() );
        for ( SujetDTO sujetDTO : list ) {
            list1.add( sujetDTOToSujet( sujetDTO ) );
        }

        return list1;
    }
}
