# 🖥️ 서버 설정 환경

서버 환경 구성 설정 가이드 현황
Rocky Linux 기반 환경에서 MariaDB, Redis, Docker 등을 포함한 전체 서버

---

## 1 원격 부팅 설정 (Wake-on-LAN)

- **BIOS 진입 후 설정**


---

## 2️ 네트워크 활성화

> 재부팅시에서 설정 유지
> 영구설정

```bash
# 네트워크 연결 활성화
nmcli device connect eno1로 eno1네트워크 활성화(설정안하면 인터넷 모쓴다)

# 부팅 시 자동 연결 설정
nmcli connection modify eno1 connection.autoconnect yes
nmcli connection up eno1

```

## 3 마리아DB설치

> 기본 저장소에서 설치
> 부팅시 자동실행 설정

```ini
root/mariadbPasswd!@
lottotalk/lottotalk
```

## 4 REDIS설치

> 부팅시 자동실행 설정
> redis.conf파일 설정
> ip전체허용: 0.0.0.0
> 비밀번호설정: requirepass redisPasswd!@

## 5 도커 설치
> 부팅시 자동 실행 설청
> 들어있는 컨테이너는 빌드시마다 설정 추가해줘야한다(--restart=always) 도커 키면 항상켜짐

## 6 디렉토리 설명
> /home/project: 모든 프로젝트 저장

## 7 편의 기능
> 프로젝트안에 restartapp.sh실행파일: 도커 컨테이너, 이미지 삭제 빌드 자동 실행파일

## 8 허용 포트
```bash
 22: SSH(원격접속)
 80: HTTP(웹 기본 포트)
 443: HTTPS(SSL 암호화 웹 포트)
 3306: MariaDB
 8080: 웹 애플리케이션 서버(Spring Boot 등)
 6379: redis포트(서버 로컬 스트로지)
 21: 첨부파일(FTP로 파일전송 포트
```
## 8 포트포워딩
```bash
22: SSH(원격접속)
80: HTTP(웹 기본 포트)
443: HTTPS(SSL 암호화 웹 포트)
3306: MariaDB
8080: 웹 애플리케이션 서버(Spring Boot 등)
8081: 웹 애플리케이션 서버(Spring Boot 등)
8082: 웹 애플리케이션 서버(Spring Boot 등)
6379: redis포트(서버 로컬 스트로지)
9: Wake-on-LAN(pc원격 부팅)
21: 첨부파일(FTP로 파일전송 포트
```








