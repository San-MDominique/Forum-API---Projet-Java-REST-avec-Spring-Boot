package ci.apirest.forum.Impl;

import ci.apirest.forum.models.Forum;
import ci.apirest.forum.repositories.ForumRepository;
import ci.apirest.forum.services.DTO.ForumDTO;
import ci.apirest.forum.services.Impl.ForumServiceImpl;
import org.hibernate.type.format.FormatMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


import static org.mockito.Mockito.when;

@SpringBootTest
public class ForumServiceImplTest {
    @Mock
    private ForumRepository bookingRepository;

    @InjectMocks
    private ForumServiceImpl forumService;

    @Test
    public void whenFindOneById_thenReturnForum(){
        when(bookingRepository.findById(50L)).thenReturn(Optional.of(new Forum(50L,"test","test","test")));
        when(forumMapper.toDto(form)).thenReturn(forumDTO);

        Optional<ForumDTO> forumRecover = forumService.finOneById(50L);
        Assertions.assertNotNull(forumRecover.orElse(null));
    }
}
