# Login Infomation

[日本語はこちら][jp]

The plugin shows [raw JSON][rj] message to the player when that player joins.

## Feature

- Decoration by raw JSON. (almost the same to /tellraw command)
- Reload and display test completed with one command

## Setting

Write raw JSON in `plugins/LoginInfomation/logininfo.json`.
That file encode is UTF-8.

**These keys do not work properly**

- `selector`
- `score`

## Commands

### logininfo <reload | show | test>

Needs op permission.
aliases:

- li
- logininfomation

#### logininfo reload

Reload seggingfile.

#### logininfo show

Chat command only.

Show the message.

#### logininfo test

Chat command only.

Reload seggingfile and show the message.

<!-- links -->
[en]:readme.md
[jp]:readme.jp.md
[rj]:https://minecraft.gamepedia.com/Commands#Raw_JSON_text