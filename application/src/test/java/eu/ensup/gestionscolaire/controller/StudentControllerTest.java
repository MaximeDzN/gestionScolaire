package eu.ensup.gestionscolaire.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.ensup.gestionscolaire.domain.Student;

import eu.ensup.gestionscolaire.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentController controller;


    @Test
    void viewStudentCreate() throws Exception {
        mockMvc.perform(get("/student").with(user("user").roles("DIR"))).andExpect(status().isOk());
    }

    @Test
    void createStudent() throws Exception {
        Student fakeStudent = new Student(0L,"dazin","14 rue chèvre","0612401108","maxime.dazin@gmail.com","maxime", new Date());
        //when(studentRepository.save(any())).thenReturn(fakeStudent);
        mockMvc.perform(post("/student").with(user("user").roles("DIR")).content(asJsonString(fakeStudent))).andExpect(status().isOk());
        //verify(studentRepository,times(1)).save(any());
    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}