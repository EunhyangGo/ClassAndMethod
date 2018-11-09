Git bash here
    Linux bash shell을 사용해 볼 수 있는 커멘트창

    $: prompt 라고 하며, 명령어를 입력하기를 기다리는 표식
       여기에 명령어를 이력하고 enter를 입력하면 해당하는 명령을 실행해서 결과를 알려준다.

ls : list를 보여달라는 가장 많이 사용되는 명령어
ls -al : list를 보여주되 여러가지 저오를 자세히 보여달라.
cd Control01 : 현재 디렉토리(폴더)에서 하위에 있는 Control01 디렉토리(폴더)로 들어가라.
폴더와 디렉토리에서 '.'는 나 자신, '..'는 부모
.와 ..: 디렉토리(폴더)에서 . 와 ..는 매우 중요한 개념이다.

cd Control01 : 현재 디렉토리에서 하위에 있는 Control01로 이동하라는 것이고
cd .. : 현재 디렉토리에서 부모(무엇인지 몰라도) 디렉토리로 이동하라는 것이다.

현재 디렉토리와 레벨이 같은 Control02로 이동하고 싶을때
1. cd ..하고 cd Control02를 실행한다.
2. cd ../Control02를 실행해도 된다.