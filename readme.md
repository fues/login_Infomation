# Login Infomation

[日本語はこちら][jp]

The plugin shows [raw JSON][rj] message to that player when the player joins.

## Feature

- Decoration by raw JSON. (almost the same to /tellraw command)
- Reload and display test completed with one command

## Setting

Write raw JSON in `plugins/LoginInfomation/logininfo.json`.
That file encode is UTF-8.

**These key do not works properly.**

- `selector`
- `score`

## Commands

### logininfo <reload | show | test>

aliases:

- li
- logininfomation

#### logininfo reload

Reload seggingfile(s).

#### logininfo show

In game only.

Show the message.

#### logininfo test

In game only.

Reload seggingfile(s) and show the message.


<!-- links -->
[en]:readme.md
[jp]:readme.jp.md
[rj]:https://minecraft.gamepedia.com/Commands#Raw_JSON_text