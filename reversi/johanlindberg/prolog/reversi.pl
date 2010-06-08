% reversi kata

position('.',0,0).
position('.',0,1).
position('W',0,2).

legal_move(R,C,Player) :-
    position('.',R,C), % position must be empty

    C1 is C + 1,
    position(Opponent,R,C1),
    Opponent \= Player,

    C2 is C + 2,
    position(Player,R,C2).
