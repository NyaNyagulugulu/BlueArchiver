# 碧蓝档案模组 - Minecraft 1.21.1 Fabric 重构版

**原项目地址：[https://www.mcmod.cn/class/10170.html](https://www.mcmod.cn/class/10170.html)**

## 🔄 关于项目重构

原有模组虽具有创意和潜力，但存在以下问题，影响后续维护与拓展：

* 长期停更，未适配 Minecraft 新版本
* 项目未开源，无法进行协作或修复问题
* 代码结构复杂混乱，维护难度较高
* 不支持 Fabric 平台，仅限于 1.20 版本

因此，本项目决定对模组进行**全面重构**，以 Fabric 为基础，重写所有内容，并适配 Minecraft 1.21.1，旨在提供更稳定、更高效、可持续发展的模组版本。

## 🔧 版本支持

**理论支持版本：1.20.1 及以上**

本项目自 Minecraft 1.21.1 起开始开发，采用 GeckoLib 4.x 及以上版本。由于 GeckoLib 4.x 的接口与旧版本不兼容，因此暂不支持向下兼容至 GeckoLib 3.x 或以下。
如果希望兼容旧版本，需使用不同的代码结构和 API，代价较高，暂无计划支持。

构建发布版本中仅提供基于 1.21.1 可直接编译的构建文件，无需修改源代码。

## ✨ 模组特色

* 支持 Minecraft 1.21.1，紧跟游戏更新
* 代码结构清晰、模块化重构，易于维护和扩展
* 完全开源，便于学习与二次开发
* 基于 Fabric 平台，性能优秀，兼容性强

## 📥 下载方式

前往 [Releases 页面](https://github.com/NyaNyagulugulu/BlueArchiver/releases) 下载最新版本。

## 📝 更新日志

### v1.6

* 略（遗失了更新记录）

### v1.7

* 添加唱片「准备出发」

### v1.8

* 添加光环的合成配方（部分配方仍待优化）
* 新增唱片获取方式（宝箱刷新和怪物掉落）
* 修复星野光环未生效的问题

## 🛠️ 构建方法

```bash
# 克隆仓库
git clone https://github.com/NyaNyagulugulu/BlueArchiver.git

# 构建（默认构建 1.21.1 版本）
./gradlew build

# 构建其他版本（例如 1.20.1）
./gradlew build -PmcVersion=1_20_1
```

## 📄 许可证

本项目基于 [GNU General Public License v2.0 (GPLv2)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.html) 开源发布。
你可以自由使用、修改和分发本项目的代码，但必须在分发时附带相同许可证，并提供源代码。

---
