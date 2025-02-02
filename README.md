# Streaming 방식 TEST

Streaming 방식으로 데이터를 처리하는 것과 메모리에 한번에 데이터를 올려 처리하는 방식의 차이점 확인

먼저 50MB 정도의 파일을 준비한 다음 JVM 이 사용할 수 있는 메모리의 크기를 파일 크기와 근접하게 설정

PdfAll 과 PdfStream 코드 실행 시 PdfAll 에서는 OOM이 발생하는 현상을 확인할 수 있음

pdf 파일은 src/main/resources/large_data.pdf 로 지정할 것