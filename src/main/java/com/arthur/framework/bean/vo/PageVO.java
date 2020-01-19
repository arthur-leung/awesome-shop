package com.arthur.framework.bean.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public class PageVO<T> {
    private final List<T> rows;
    private PageVO<T>.PageInfo page = new PageVO.PageInfo();

    public PageVO(IPage<T> page) {
        this.rows = page.getRecords();
        this.page.setOffset(page.getSize());
        this.page.setPages(page.getTotal() / page.getSize() + (long) (page.getTotal() % page.getSize() == 0L ? 0 : 1));
        this.page.setCurrent(page.getCurrent());
        this.page.setRows(page.getTotal());
    }

    private PageVO() {
        this.rows = null;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public PageVO<T>.PageInfo getPage() {
        return this.page;
    }

    public void setPage(PageVO<T>.PageInfo page) {
        this.page = page;
    }

    public String toString() {
        return "PageVO(rows=" + this.getRows() + ", page=" + this.getPage() + ")";
    }

    private class PageInfo {
        private Long offset;
        private Long current;
        private Long pages;
        private Long rows;

        public PageInfo() {
        }

        public Long getOffset() {
            return this.offset;
        }

        public Long getCurrent() {
            return this.current;
        }

        public Long getPages() {
            return this.pages;
        }

        public Long getRows() {
            return this.rows;
        }

        public void setOffset(Long offset) {
            this.offset = offset;
        }

        public void setCurrent(Long current) {
            this.current = current;
        }

        public void setPages(Long pages) {
            this.pages = pages;
        }

        public void setRows(Long rows) {
            this.rows = rows;
        }

        public String toString() {
            return "PageVO.PageInfo(offset=" + this.getOffset() + ", current=" + this.getCurrent() + ", pages=" + this.getPages() + ", rows=" + this.getRows() + ")";
        }
    }
}
