# Login Infomation

[English ver readme is hare][en]

ログインしたプレイヤーに[raw JSON][rj]のメッセージを表示します。

tellrawコマンドと**大体同じ**動作をします。
一番上の配列では直前で指定した書式が後ろに受け継がれなかったりする違いがあります。

## 特徴

- raw JSON による装飾。
- 1コマンドでリロード&テスト表示

## 設定

`plugins/LoginInfomation/logininfo.json`

このファイルにraw JSONを書けばOK。
文字コードはUTF-8。

**以下の機能は正常に動作しません。**

- `selector`
- `score`

## コマンド

### logininfo <reload | show | test>

opのパーミッションが必要です。
別名

- li
- logininfomation

#### logininfo reload

設定ファイルを再読込みします。

#### logininfo show

ゲーム内チャットコマンドのみ。

今読み込んでるログインメッセージを表示します。

#### logininfo test

ゲーム内チャットコマンドのみ。

設定ファイルを再読込みしてログインメッセージを表示します。

<!-- links -->
[en]:readme.md
[jp]:readme.jp.md
[rj]:https://minecraft.gamepedia.com/Commands#Raw_JSON_text