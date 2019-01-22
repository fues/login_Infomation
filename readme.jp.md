# Login Infomation

[English ver is hare][en]

ログインしたプレイヤーに[raw JSON][rj]のメッセージを表示します。

tellrawコマンドと**大体同じ**動作をします。
一番上の配列では直前で指定した書式が後ろに受け継がれなかったりする違いがあります。

## 設定

`plugins/LoginInfomation/logininfo.json`

このファイルにraw JSONを書けばOK。
文字コードはUTF-8。

**以下の機能は正常に動作しません。**

- `selector`
- `score`

## コマンド

### logininfo <reload | show | test>

最初の`logininfo`は

```shell
li
logininfomation
```

で代用できます。

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