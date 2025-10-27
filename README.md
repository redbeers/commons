# 🖥️ 서버 설정 가이드

이 문서는 **LottoTalk 서버 환경 구성**을 위한 설정 가이드입니다.  
Rocky Linux 기반 환경에서 MariaDB, Redis, Docker 등을 포함한 전체 서버 구성 과정을 설명합니다.

---

## 1️⃣ 원격 부팅 설정 (Wake-on-LAN)

- **BIOS 진입 후 설정 필요**
  - 전원 관리(“Power Management” 또는 “Advanced”) → **Wake on LAN** 활성화  
  - 저장 후 종료  
- 이후 네트워크를 통해 원격 부팅 명령(`wol`) 가능  

---

## 2️⃣ 네트워크 활성화

> `eno1` 네트워크 인터페이스 기준  

```bash
# 네트워크 연결 활성화
nmcli device connect eno1

# 부팅 시 자동 연결 설정
nmcli connection modify eno1 connection.autoconnect yes
nmcli connection up eno1

# 기본 저장소에서 설치
sudo dnf install mariadb-server -y

# 부팅 시 자동 실행 설정
sudo systemctl enable mariadb
sudo systemctl start mariadb
