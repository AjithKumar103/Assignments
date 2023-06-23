let count = JSON.parse(localStorage.getItem('count'));
    if(count === null){
      count = {
        win : 0,
        loose : 0,
        tie : 0
      }
    }
    function removeElements(){
      count.win = 0;
      count.loose = 0;
      count.tie = 0;
      document.querySelector('.js-scores').innerHTML = `Win:${count.win},Loose:${count.loose},Tie:${count.tie}`
    }

    function counter(result){
      if (result === 'Tie')
        count.tie++;
      else if (result === 'You loose!')
        count.loose++;
      else
        count.win++
    }

    function pickComputerMove(){
      let computerMove = '';
      const randomNumber = Math.random();
      
      if (randomNumber >= 0 && randomNumber <= 1/3)
        computerMove = 'rock';
      else if (randomNumber > 1/3 && randomNumber <= 2/3)
        computerMove = 'paper';
      else
        computerMove = 'scissors';
      return computerMove;
    }
document.querySelector('.js-rock-button').addEventListener('click',() => playGame('rock'));
document.querySelector('.js-paper-button').addEventListener('click',() => playGame('paper'));
document.querySelector('.js-scissors-button').addEventListener('click',() => playGame('scissors'));

document.body.addEventListener('keydown',(event) => {
  if (event.key === 'r') playGame('rock');
  else if (event.key === 'p') playGame('paper');
  else if (event.key === 's') playGame('scissors');
});

    function playGame(playerMove){
      const computerMove = pickComputerMove();
      let result = '';
      if (playerMove === 'rock'){
        if (computerMove === 'rock')
          result = 'Tie';
        else if (computerMove === 'scissors')
          result = 'You win!';
        else
          result = 'You loose!';
      }

      else if (playerMove === 'paper'){
        if (computerMove === 'rock')
          result = 'You Win!';
        else if (computerMove === 'scissors')
          result = 'You loose!';
        else
          result = ' Tie';
      }

      else if (playerMove === 'scissors'){
        if (computerMove === 'rock')
          result = 'You loose!';
        else if (computerMove === 'scissors')
          result = 'Tie';
        else
          result = 'You Win!';
      }
      counter(result);
      localStorage.setItem('count',JSON.stringify(count));

      document.querySelector('.js-result').innerHTML = result;
      document.querySelector('.js-moves').innerHTML = `You <img src="rock-paper-scissors/${playerMove}-emoji.png"> <img src="rock-paper-scissors/${computerMove}-emoji.png"> Computer`;
      document.querySelector('.js-scores').innerHTML = `Win: ${count.win}, Loose: ${count.loose}, Tie: ${count.tie}`
    }

    let stopValue = false;
    let intervalId;
    function autoPlay(){
      if (!stopValue){
        intervalId = setInterval(() => {
          const computerPlayerMove = pickComputerMove();
          playGame(computerPlayerMove)},2000);
        stopValue = true;
      }
      else{
        clearInterval(intervalId);
        stopValue = false;
      }
    }

    