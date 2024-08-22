document.addEventListener('DOMContentLoaded', () => {
    const teamItems = document.querySelectorAll('.team-item'); // 모든 팀 아이템 선택
    const teamCircle = document.querySelector('.team-circle'); // 팀들이 배치될 원형 컨테이너
    const actionButtons = document.querySelector('.action-buttons'); // 액션 버튼 컨테이너
    const matchButton = document.querySelector('#matchButton'); // Match 버튼 선택

    let selectedTeams = []; // 선택된 팀을 저장할 배열

    // 팀 아이템을 원형으로 배치하는 함수
    function positionTeamsInCircle() {
        const radius = 300; // 원의 반지름
        const angle = 2 * Math.PI / teamItems.length; // 각도 계산

        teamItems.forEach((item, index) => {
            const x = radius * Math.cos(angle * index) + (teamCircle.offsetWidth / 2 - item.offsetWidth / 2);
            const y = radius * Math.sin(angle * index) + (teamCircle.offsetHeight / 2 - item.offsetHeight / 2);
            
            // 팀 아이템의 위치 설정
            item.style.position = 'absolute';
            item.style.left = `${x}px`;
            item.style.top = `${y}px`;
        });
    }

    // 팀 아이템을 원형으로 배치
    positionTeamsInCircle();

    // 팀 아이템 클릭 시 처리하는 이벤트
    teamItems.forEach(item => {
        item.addEventListener('click', () => {
            if (selectedTeams.includes(item)) {
                // 이미 선택된 팀을 클릭한 경우
                selectedTeams.splice(selectedTeams.indexOf(item), 1); // 선택 배열에서 제거
                item.style.opacity = '0.3'; // 클릭한 팀을 흐리게 설정

                // 나머지 팀이 존재한다면
                if (selectedTeams.length === 1) {
                    // 선택된 팀이 하나만 남아있을 경우
                    selectedTeams[0].style.opacity = '1'; // 남은 선택된 팀을 밝게 설정

                    // Match 버튼 표시
                    actionButtons.style.display = 'flex';
                } else {
                    // 선택된 팀이 없으면
                    teamItems.forEach(t => {
                        t.style.opacity = '1'; // 모든 팀을 밝게 설정
                    });

                    // Match 버튼 숨김
                    actionButtons.style.display = 'none';
                }
            } else {
                // 새 팀을 클릭한 경우
                if (selectedTeams.length === 2) {
                    // 이미 두 팀이 선택된 상태라면
                    selectedTeams.forEach(t => {
                        t.style.opacity = '0.3'; // 두 팀을 흐리게 설정
                    });
                    selectedTeams = []; // 선택 배열 초기화
                    actionButtons.style.display = 'none'; // Match 버튼 숨김
                }

                // 선택한 팀을 선택된 상태로 변경
                selectedTeams.push(item); // 선택 배열에 추가
                item.style.opacity = '1'; // 클릭한 팀만 밝게 설정

                // 나머지 팀 흐리게
                teamItems.forEach(t => {
                    if (!selectedTeams.includes(t)) {
                        t.style.opacity = '0.3'; // 흐리게 설정
                    }
                });

                // 두 개의 팀이 선택된 경우 Match 버튼 표시
                if (selectedTeams.length === 2) {
                    actionButtons.style.display = 'flex';
                }
            }
        });
    });

        // 선택된 팀을 저장할 배열
        let selectedTeamIteams = [];

        // 팀 아이템 클릭 시 처리
        document.querySelectorAll('.team-item').forEach(item => {
            item.addEventListener('click', function() {
                const teamName = this.getAttribute('data-team');

                // 이미 선택된 팀인 경우 선택 해제
                if (selectedTeamIteams.includes(teamName)) {
                    selectedTeamIteams = selectedTeamIteams.filter(team => team !== teamName);
                    this.classList.remove('selected');
                } else {
                    // 새롭게 선택된 팀 추가
                    if (selectedTeamIteams.length < 2) {
                        selectedTeamIteams.push(teamName);
                        this.classList.add('selected');
                    }
                }

                // 모든 팀 아이템 흐리게 처리
                document.querySelectorAll('.team-item').forEach(item => {
                    item.classList.toggle('dimmed', !selectedTeamIteams.includes(item.getAttribute('data-team')));
                });

                // 선택된 팀이 두 개일 경우에만 Match 버튼 활성화
                if (selectedTeamIteams.length === 2) {
                    document.querySelector('#matchButton').disabled = false;
                    document.querySelector('.action-buttons').style.display = 'block';
                    
                    // 폼에 선택된 팀 이름 설정
                    document.querySelector('#team1').value = selectedTeamIteams[0];
                    document.querySelector('#team2').value = selectedTeamIteams[1];
                } else {
                    document.querySelector('.action-buttons').style.display = 'none';
                }
            });
        });

});
