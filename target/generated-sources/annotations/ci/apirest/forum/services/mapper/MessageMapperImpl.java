package ci.apirest.forum.services.mapper;

import ci.apirest.forum.models.Message;
import ci.apirest.forum.services.DTO.MessageDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-13T11:41:23+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageDTO toDto(Message entity) {
        if ( entity == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setId( entity.getId() );
        messageDTO.setContenu( entity.getContenu() );

        return messageDTO;
    }

    @Override
    public Message toEntity(MessageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( dto.getId() );
        message.setContenu( dto.getContenu() );

        return message;
    }
}
