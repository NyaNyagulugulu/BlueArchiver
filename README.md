# 碧蓝档案模组 - 1.21.1 Fabric 重置版

**原项目地址：https://www.mcmod.cn/class/10170.html**

## 版本支持

**理论支持版本：1.20.1+**

**因为本项目是从1.21.1开始开发的**
所以代码用新不用旧，如果要兼容到1.20.1以下需要使用“GeckoLib 3.x”以下的版本。因为本项目依赖GeckoLib 4.x以上版本，所以代码写法完全不一样。

**因代码版本太新兼容旧版本需要更换旧版api接口。所以暂时不做得不偿失的操作，降级api接口版本。因此在releases仅提供无需修改代码可编译构建的版本**

## 🤬 关于那个傻逼原项目

妈的，说真的，原项目作者就是个懒狗：

- 停更？你妈呢停更，连公告都不发一个
- 闭源？装你妈高手，代码都烂得像狗啃的
- 永远卡在 1.20？你当 1.21 出来是摆设？
- 代码结构一坨屎，逻辑乱得看了想砸显示器

老子实在受不了了，直接他妈重写了一个 Fabric 版，还特么支持最新的 1.21.1！

## ✨ 模组特性

- 去他妈的 1.20 限制，直接上 1.21.1！
- 原项目那坨屎一样的代码？老子全重写，干净利落
- **开源**！操你妈的闭源装逼犯
- 基于 Fabric，性能比他妈 Forge 好十倍不止！

## 📥 下载方式

> 去 [Release 页面](https://github.com/NyaNyagulugulu/BlueArchiver/releases) 下载  
> 傻逼原项目连个下载都要绕三圈，服了

## 🛠️ 构建方法

```bash
# 克隆仓库
git clone https://github.com/NyaNyagulugulu/BlueArchiver.git

# 构建（默认为1.21.1版本）
./gradlew build

# 构建其他版本，例如1.20.1
./gradlew build -PmcVersion=1_20_1
```

