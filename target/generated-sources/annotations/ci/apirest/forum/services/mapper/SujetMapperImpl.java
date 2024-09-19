package ci.apirest.forum.services.mapper;

import ci.apirest.forum.models.Message;
import ci.apirest.forum.models.Sujet;
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
public class SujetMapperImpl implements SujetMapper {

    @Override
    public SujetDTO toDto(Sujet entity) {
        if ( entity == null ) {
            return null;
        }

        SujetDTO sujetDTO = new SujetDTO();

        sujetDTO.setId( entity.getId() );
        sujetDTO.setTitre( entity.getTitre() );
        sujetDTO.setNom( entity.getNom() );
        sujetDTO.setSlug( entity.getSlug() );
        sujetDTO.setMessages( messageListToMessageDTOList( entity.getMessages() ) );

        return sujetDTO;
    }

    @Override
    public Sujet toEntity(SujetDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sujet sujet = new Sujet();

        sujet.setId( dto.getId() );
        sujet.setTitre( dto.getTitre() );
        sujet.setSlug( dto.getSlug() );
        sujet.setNom( dto.getNom() );
        sujet.setMessages( messageDTOListToMessageList( dto.getMessages() ) );

        return sujet;
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
}
