package am.team.edo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
class EDOReceiverOperator {

    EDOReceiverOperator() {

    }
    /*Логическое сообщение служит для передачи ЭД между Операторами на технологическом уровне и содержит информацию о передаче комплекта документов и/или подписей под документами и представляет собой ZIP-архив, содержащий директорию с несколькими файлами:
    ● description.xml - описание логического сообщения (должен присутствовать всегда);
    ● <ИдДокумента>.bin - содержимое документа (может быть множественным или отсутствовать, см. п. 7.2.2);
    ● <ИдКЭП>.p7s - электронная подпись под документом (может отсутствовать);
     */

    @PostMapping("/SendTransportPackage")
    public ResponseEntity uploadToLocalFileSystem(@RequestParam("file") MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Path path = Paths.get(fileName);
        try {
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/files/download/")
                .path(fileName)
                .toUriString();
        return ResponseEntity.ok(fileDownloadUri);
    }
}