document.addEventListener('DOMContentLoaded', () => {
    const seasonSelect = document.getElementById('season');
    const teamSelect = document.getElementById('team');
    const matchData = document.getElementById('match-data');

    function updateTeams() {
        const season = seasonSelect.value;
        if (!season) return;

        fetch(`/api/teams?season=${season}`)
            .then(response => response.json())
            .then(teams => {
                teamSelect.innerHTML = '<option value="">-- 선택 --</option>';
                teams.forEach(team => {
                    const option = document.createElement('option');
                    option.value = team;
                    option.textContent = team;
                    teamSelect.appendChild(option);
                });
            });
    }

    function fetchMatches() {
        const season = seasonSelect.value;
        const team = teamSelect.value;

        if (!season || !team) return;

        fetch(`/api/matches?season=${season}&team=${team}`)
            .then(response => response.json())
            .then(data => {
                if (data.length === 0) {
                    matchData.innerHTML = '<tr><td colspan="20">데이터가 없습니다.</td></tr>';
                    return;
                }
                
                matchData.innerHTML = data.map(match => `
                    <tr>
                        <td>${match.season}</td>
                        <td>${match.date}</td>
                        <td>${match.team}</td>
                        <td>${match.teamScore}</td>
                        <td>${match.opponentScore}</td>
                        <td>${match.opponentTeam}</td>
                        <td>${match.champion}</td>
                        <td>${match.opponentChampion}</td>
                        <td>${match.player}</td>
                        <td>${match.opponentPlayer}</td>
                        <td>${match.kda}</td>
                        <td>${match.opponentKda}</td>
                        <td>${match.damage}</td>
                        <td>${match.opponentDamage}</td>
                        <td>${match.sight}</td>
                        <td>${match.opponentSight}</td>
                        <td>${match.cs}</td>
                        <td>${match.opponentCs}</td>
                        <td>${match.perCs}</td>
                        <td>${match.opponentPerCs}</td>
                    </tr>
                `).join('');
            });
    }

    seasonSelect.addEventListener('change', updateTeams);
    teamSelect.addEventListener('change', fetchMatches);
});
